package cs.mad.madflashcards.entities

data class Flashcard(val term: String, val def: String) {
    val cards = mutableMapOf(term to def)
}

fun main(args: Array<String>) {
    val flashcard = Flashcard("Cat", "Animal")
    flashcard.cards.put("Red", "Color")
    flashcard.cards.put("Legos", "Toy")
    flashcard.cards.put("Rubix Cube", "Puzzle")
    flashcard.cards.put("Windows", "Operating System")
    flashcard.cards.put("Pen", "Writing Utensil")
    flashcard.cards.put("Gaming", "Hobby")
    flashcard.cards.put("Last of the Mohikans", "Movie")
    flashcard.cards.put("Alabama", "State")
    flashcard.cards.put("Flashcard", "Study Material")

    for ((k, v) in flashcard.cards) {
        println("$k = $v")
    }
}



