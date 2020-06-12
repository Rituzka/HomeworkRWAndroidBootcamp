package model.cafe

data class Sponsorship(
        val customerId: String,
        val catId: String
) {
    companion object {
        var sponsorCats = mutableListOf<Sponsorship>()
    }
}