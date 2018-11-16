package hello.data;

import com.couchbase.client.java.repository.annotation.Id;
import com.couchbase.client.java.repository.annotation.Field;
import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.couchbase.core.mapping.Document;

@Getter
@Document
public class User {

    @Id
    private String id;

    @Field
    private String firstname;

    @Field
    private String lastname;

    public User(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

}