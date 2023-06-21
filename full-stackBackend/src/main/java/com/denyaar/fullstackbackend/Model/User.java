/**
 * Created by tendaimupezeni for full-stackBackend
 * User: tendaimupezeni
 * Date: 21/6/2023
 * Time: 00:49
 */

package com.denyaar.fullstackbackend.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "username")
})
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String username;
    private String name;
    private String email;

}
