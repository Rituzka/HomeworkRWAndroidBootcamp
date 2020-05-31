
    fun main() {

         val blackJackController = CardController()
         val setCards: MutableSet<Card>
         val listCards: MutableList<Card>

        setCards = blackJackController.createDeck()
        listCards = blackJackController.dealHand(setCards.toMutableList(),2)
        val evaluateHand = blackJackController.evaluateHand(listCards)
        blackJackController.printResults(listCards,evaluateHand)



    }
