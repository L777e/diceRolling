package edu.duke.summer.server.database.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Document
public class ObjectValue {

    @Id @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid")
    private String id;

    private String gameId;

    private String playerUuid;

    private String objectName;

    private String objectValue;

    public String getId() {
        return id;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getPlayerUuid() {
        return playerUuid;
    }

    public void setPlayerUuid(String playerUuid) {
        this.playerUuid = playerUuid;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(String objectValue) {
        this.objectValue = objectValue;
    }

    public ObjectValue() {}

    public ObjectValue(String gameId, String playerUuid, String objectName, String objectValue) {
        this.gameId = gameId;
        this.playerUuid = playerUuid;
        this.objectName = objectName;
        this.objectValue = objectValue;
    }

    @Override
    public String toString() {
        return "ObjectValue{" +
                "id='" + id + '\'' +
                ", gameId='" + gameId + '\'' +
                ", playerUuid='" + playerUuid + '\'' +
                ", objectName='" + objectName + '\'' +
                ", objectValue='" + objectValue + '\'' +
                '}';
    }
}
