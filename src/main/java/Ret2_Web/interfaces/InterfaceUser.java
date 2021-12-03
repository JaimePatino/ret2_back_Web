/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ret2_Web.interfaces;

import Ret2_Web.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author jaime
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}