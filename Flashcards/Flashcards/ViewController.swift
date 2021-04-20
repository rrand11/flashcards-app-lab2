//
//  ViewController.swift
//  Flashcards
//
//  Created by Ryan Jones on 2/3/21.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        let makeFlashcard = Flashcard()
        var cards = [makeFlashcard.term:makeFlashcard.def]
        
        cards.updateValue("Animal", forKey: "Cat")
        cards.updateValue("Toy", forKey: "Legos")
        cards.updateValue("Color", forKey: "Red")
        cards.updateValue("Puzzle", forKey: "Rubix Cube")
        cards.updateValue("Operating System", forKey: "Windows")
        cards.updateValue("Writing Utensil", forKey: "Pen")
        cards.updateValue("Hobby", forKey: "Gaming")
        cards.updateValue("Alamama", forKey: "State")
        cards.updateValue("Italy", forKey: "Country")
        cards.updateValue("School", forKey: "Work")
        for (key,value) in cards{
            print("term:\(key) definition:\(value)")
            
        let makeFlashcardSet = FlashcardSet()
        var cardsSet = [makeFlashcardSet.term:makeFlashcardSet.def]
            
        cardsSet.updateValue("Animal", forKey: "Cat")
        cardsSet.updateValue("Toy", forKey: "Legos")
        cardsSet.updateValue("Color", forKey: "Red")
        cardsSet.updateValue("Puzzle", forKey: "Rubix Cube")
        cardsSet.updateValue("Operating System", forKey: "Windows")
        cardsSet.updateValue("Writing Utensil", forKey: "Pen")
        cardsSet.updateValue("Hobby", forKey: "Gaming")
        cardsSet.updateValue("Alamama", forKey: "State")
        cardsSet.updateValue("Italy", forKey: "Country")
        cardsSet.updateValue("School", forKey: "Work")
        
            print(makeFlashcardSet.title)
        for (key,value) in cardsSet{
            print("term:\(key) definition:\(value)")
            
    }
}
}

}
