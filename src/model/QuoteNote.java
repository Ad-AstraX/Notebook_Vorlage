package model;

public class QuoteNote extends Note {
    private String source;

    public QuoteNote(String title, String quoteText, String source) {
        //TODO: Implementiere den Konstruktor
        super(title, quoteText);
        this.source = source;
    }

    /**
     * Erzeugt aus allen Informationen einen Ausgabestring in der Form:
     * "[Titel]: [Inhalt]. Urheber: [Urheber]. Erstellt am: [Datum]"
     * @return Ausgabestring für eine einzelne Zitatsnotiz
     */
    @Override
    public String display() {
        //TODO: Implementiere die Methode display() entsprechend der Dokumentation / des Kommentars oben.
        return title + ": " + content + ". Urheber: " + source + ". Erstellt am: " + creationDate;
    }


    //Getter und Setter
    public String getQuoteText() {
        return content;
    }

    public void setQuoteText(String quoteText) {
        this.content = quoteText;
    }

    public String getSource() { return source; }

    public void setSource(String source) {
        this.source = source;
    }
}
