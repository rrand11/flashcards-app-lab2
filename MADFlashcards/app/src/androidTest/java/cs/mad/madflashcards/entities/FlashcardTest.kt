package cs.mad.madflashcards.entities

data class Flashcard(val term: String, val def: String) {
    fun main(args: Array<String>){
        val flashcard= Flashcard("Ryan", "round brown bug")
        print("Flashcard details: $flashcard")
    }
}