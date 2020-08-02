package com.e.blockbusterrecycler.model;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDatabase_Impl extends MovieDatabase {
  private volatile MovieDAO _movieDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `moviesData` (`title` TEXT, `year` INTEGER, `released` TEXT, `director` TEXT, `actors` TEXT, `poster` TEXT, `id` TEXT NOT NULL, `type` TEXT, `response` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2e70a9d4eedd6529bcff62c45ff7e18b')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `moviesData`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMoviesData = new HashMap<String, TableInfo.Column>(9);
        _columnsMoviesData.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesData.put("year", new TableInfo.Column("year", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesData.put("released", new TableInfo.Column("released", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesData.put("director", new TableInfo.Column("director", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesData.put("actors", new TableInfo.Column("actors", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesData.put("poster", new TableInfo.Column("poster", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesData.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesData.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesData.put("response", new TableInfo.Column("response", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMoviesData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMoviesData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMoviesData = new TableInfo("moviesData", _columnsMoviesData, _foreignKeysMoviesData, _indicesMoviesData);
        final TableInfo _existingMoviesData = TableInfo.read(_db, "moviesData");
        if (! _infoMoviesData.equals(_existingMoviesData)) {
          return new RoomOpenHelper.ValidationResult(false, "moviesData(com.e.blockbusterrecycler.networking.MovieModelApi).\n"
                  + " Expected:\n" + _infoMoviesData + "\n"
                  + " Found:\n" + _existingMoviesData);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2e70a9d4eedd6529bcff62c45ff7e18b", "b9761df37e9b5a778d05e28d736834a2");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "moviesData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `moviesData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieDAO movieDao() {
    if (_movieDAO != null) {
      return _movieDAO;
    } else {
      synchronized(this) {
        if(_movieDAO == null) {
          _movieDAO = new MovieDAO_Impl(this);
        }
        return _movieDAO;
      }
    }
  }
}
