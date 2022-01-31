package org.launchcode.secretnote.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
public class SecretNote {

    @NotBlank(message = "Please enter a note name")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    /** Removing Folder for now, will likely be re-added later - CR */
    //private Folder folder;

    @NotBlank(message = "Please enter a note")
    @Size(min = 1, max = 500, message = "Note must be between 1 and 500 characters")
    private String content;

    @Id
    private UUID id = UUID.randomUUID();

    public SecretNote(String name, String content, UUID id) {
        this.name = name;
        this.content = content;
        this.id = id;
    }

    public SecretNote() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    } */

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UUID getId() { return id;}

    @Override
    public String toString() {
        return name;
    }
}
