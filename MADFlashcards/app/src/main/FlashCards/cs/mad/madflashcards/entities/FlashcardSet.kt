package cs.mad.madflashcards.entities

data class FlashcardSet (var title: String) {
    var term: String = " "
    var def: String = " "

    //val tencards: kotlin.collections.mutableMapOf(term to def)
}

fun main(args: Array<String>) {
    val flashcardset = FlashcardSet("Object Cards")

    val (title) = flashcardset
    flashcardset.term = "Animal"
    flashcardset.def = "Cat"

    val tencards = Flashcard(flashcardset.term,flashcardset.def).cards
    tencards.put("Red", "Color")
    tencards.put("Legos", "Toy")
    tencards.put("Rubix Cube", "Puzzle")
    tencards.put("Windows", "Operating System")
    tencards.put("Pen", "Writing Utensil")
    tencards.put("Gaming", "Hobby")
    tencards.put("Last of the Mohikans", "Movie")
    tencards.put("Alabama", "State")
    tencards.put("Flashcard", "Study Material")
    println("title = $title")
    for ((k, v) in tencards) {
        println("$k = $v")
    }
}