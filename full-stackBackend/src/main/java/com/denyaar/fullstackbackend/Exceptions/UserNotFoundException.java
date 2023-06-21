/**
 * Created by tendaimupezeni for full-stackBackend
 * User: tendaimupezeni
 * Date: 21/6/2023
 * Time: 14:48
 */

package com.denyaar.fullstackbackend.Exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find the user with id " + id );
    }
}
