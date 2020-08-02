package com.e.blockbusterrecycler.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.e.blockbusterrecycler.networking.MovieModelApi;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDAO_Impl implements MovieDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieModelApi> __insertionAdapterOfMovieModelApi;

  private final SharedSQLiteStatement __preparedStmtOfClearAllMovies;

  public MovieDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieModelApi = new EntityInsertionAdapter<MovieModelApi>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `moviesData` (`title`,`year`,`released`,`director`,`actors`,`poster`,`id`,`type`,`response`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieModelApi value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getYear() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getYear());
        }
        if (value.getReleased() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getReleased());
        }
        if (value.getDirector() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDirector());
        }
        if (value.getActors() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getActors());
        }
        if (value.getPoster() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPoster());
        }
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getId());
        }
        if (value.getType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getType());
        }
        final int _tmp;
        _tmp = value.getResponse() ? 1 : 0;
        stmt.bindLong(9, _tmp);
      }
    };
    this.__preparedStmtOfClearAllMovies = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM moviesData";
        return _query;
      }
    };
  }

  @Override
  public Object insertMovies(final List<MovieModelApi> movies,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieModelApi.insert(movies);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertMovie(final MovieModelApi movie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieModelApi.insert(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object clearAllMovies(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllMovies.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearAllMovies.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<MovieModelApi>> findAllMovies() {
    final String _sql = "SELECT * FROM moviesData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"moviesData"}, false, new Callable<List<MovieModelApi>>() {
      @Override
      public List<MovieModelApi> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "released");
          final int _cursorIndexOfDirector = CursorUtil.getColumnIndexOrThrow(_cursor, "director");
          final int _cursorIndexOfActors = CursorUtil.getColumnIndexOrThrow(_cursor, "actors");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfResponse = CursorUtil.getColumnIndexOrThrow(_cursor, "response");
          final List<MovieModelApi> _result = new ArrayList<MovieModelApi>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieModelApi _item;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final Integer _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            }
            final String _tmpReleased;
            _tmpReleased = _cursor.getString(_cursorIndexOfReleased);
            final String _tmpDirector;
            _tmpDirector = _cursor.getString(_cursorIndexOfDirector);
            final String _tmpActors;
            _tmpActors = _cursor.getString(_cursorIndexOfActors);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final boolean _tmpResponse;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfResponse);
            _tmpResponse = _tmp != 0;
            _item = new MovieModelApi(_tmpTitle,_tmpYear,_tmpReleased,_tmpDirector,_tmpActors,_tmpPoster,_tmpId,_tmpType,_tmpResponse);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object findMovieById(final String movieId, final Continuation<? super MovieModelApi> p1) {
    final String _sql = "SELECT * FROM moviesData WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (movieId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, movieId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<MovieModelApi>() {
      @Override
      public MovieModelApi call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "released");
          final int _cursorIndexOfDirector = CursorUtil.getColumnIndexOrThrow(_cursor, "director");
          final int _cursorIndexOfActors = CursorUtil.getColumnIndexOrThrow(_cursor, "actors");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfResponse = CursorUtil.getColumnIndexOrThrow(_cursor, "response");
          final MovieModelApi _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final Integer _tmpYear;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmpYear = null;
            } else {
              _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            }
            final String _tmpReleased;
            _tmpReleased = _cursor.getString(_cursorIndexOfReleased);
            final String _tmpDirector;
            _tmpDirector = _cursor.getString(_cursorIndexOfDirector);
            final String _tmpActors;
            _tmpActors = _cursor.getString(_cursorIndexOfActors);
            final String _tmpPoster;
            _tmpPoster = _cursor.getString(_cursorIndexOfPoster);
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final boolean _tmpResponse;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfResponse);
            _tmpResponse = _tmp != 0;
            _result = new MovieModelApi(_tmpTitle,_tmpYear,_tmpReleased,_tmpDirector,_tmpActors,_tmpPoster,_tmpId,_tmpType,_tmpResponse);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
