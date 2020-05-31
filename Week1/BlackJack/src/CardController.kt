class CardController {

    fun createDeck(): MutableSet<Card> {
        val listSuits = listOf('C', 'D', 'S', 'H')
        val listPips = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14)
        val setCards = mutableSetOf<Card>()

        for (pip in listPips) {
            for (suit in listSuits) {
                val card = Card(
                        pip,
                        suit
                )
                setCards.add(card)
            }
        }
        return setCards
    }

    fun dealHand(deck: MutableList<Card>, handNumber: Int): MutableList<Card> {
        val deckHand = mutableListOf<Card>()
        var hand = 0

        while (hand < handNumber) {
            val card = deck.random()
            deckHand.add(card)
            hand += 1
        }

        return deckHand
    }

    fun evaluateHand(deckHand: MutableList<Card>): Int {
        var sumPips = 0

        for (card in deckHand) {

            if(card.pip == 1){
                sumPips+=11
            }else if (card.pip==12 || card.pip==13 || card.pip==14) {
                sumPips+=10
            }else
                sumPips += card.pip
        }

        return sumPips
    }

    fun printResults(deckHand: MutableList<Card>, sumPips:Int){

        println("\n Your Hand was:\n")

        for (card in deckHand){

            when(card.suit){
                'H' -> print("\u2665 ")
                'S' -> print("\u2660 ")
                'D' -> print("\u2666 ")
                'C' -> print("\u2663 ")
            }
            if(card.pip == 1)
                println("A")
            else if(card.pip == 12)
                println("J")
            else if(card.pip == 13)
                println("Q")
            else if(card.pip == 14)
                println ("K")
            else
                println("${card.pip}")

        }

        println("\nFor a Total of $sumPips")

        if(sumPips == 21)
            println ("YOU WIN!! CONGRATULATIONS!!")
    }

}