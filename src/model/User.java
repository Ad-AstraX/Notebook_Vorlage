package model;

public class User {
    private String username;
    private Note[] notes;
    private int noteCount;

    public User(String username){
        //TODO: Implementiere den Konstruktor.
        this.username = username;
        notes = new Note[5];
        noteCount =0;
    }

    /**
     * Fügt dem Nutzer eine neue Notiz hinzu. Dies geschieht nur, falls noch genügend Platz im Array ist.
     * @param note Die übergebene Notiz.
     * @return Boolscher Wert, ob das Hinzufügen funktioniert hat oder nicht.
     */
    public boolean addNote(Note note) {
        //TODO: Implementiere die Methode
        if (notes.length > noteCount) {
            notes[noteCount] = note;
            return true;
        }
        return false;
    }

    /**
     * Löscht die Notiz, die an der entsprechenden Stelle im Notizen-Array gespeichert ist.
     * Damit es keine Leerstellen in dem Array gibt, werden alle dahinter stehenden Notizen jeweils einen Platz nach vorne verschoben.
     * @param index Index der zu löschenden Notiz
     * @return true, falls das Note-Objekt erfolgreich gelöscht wurde; false sonst
     */
    public boolean removeNote(int index) {
        //TODO: Implementiere die Methode
        if (index < notes.length && index >= 0) {
            for (int i = index; i < notes.length; i++) {
                if (notes[i] != null) {
                    notes[i-1] = notes[i];
                }
                notes[i] = null;
            }
            return true;
        }
        return false;
    }

    //Getter und Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Note[] getNotes() {
        return notes;
    }
}
