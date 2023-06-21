/**
 * Created by tendaimupezeni for full-stackBackend
 * User: tendaimupezeni
 * Date: 21/6/2023
 * Time: 00:58
 */

package com.denyaar.fullstackbackend.Repository;

import com.denyaar.fullstackbackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
