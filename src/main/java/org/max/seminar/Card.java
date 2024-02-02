package org.max.seminar;

import org.max.seminar.type.Ranks;
import org.max.seminar.type.Suits;

/**
 * Объект карты состоит из масти и значения
 */
public class Card {

    private Ranks rank;
    private Suits suit;

    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRanksValue() {
        return rank.getValue();
    }

    public String getCardValue() {
        return rank.getName() + " " + suit.getName();
    }

    public Card copyCard () {
        return new Card(this.rank, this.suit);
    }
}
