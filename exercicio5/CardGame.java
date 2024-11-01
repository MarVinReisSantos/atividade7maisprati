class Card {
    String suit;
    String value;
    Card prev;
    Card next;

    Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
}

class Hand {
    private Card head;

    public void addCard(String suit, String value) {
        Card newCard = new Card(suit, value);
        if (head == null) {
            head = newCard;
        } else {
            Card temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newCard;
            newCard.prev = temp;
        }
    }

    public void removeCard(String suit, String value) {
        Card temp = head;
        while (temp != null) {
            if (temp.suit.equals(suit) && temp.value.equals(value)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                if (temp == head) head = temp.next;
                break;
            }
            temp = temp.next;
        }
    }

    public void displayHand() {
        Card temp = head;
        while (temp != null) {
            System.out.println(temp.value + " of " + temp.suit);
            temp = temp.next;
        }
    }
}
