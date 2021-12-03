/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ret2_Web.interfaces;

import Ret2_Web.model.Hairproducts;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jaime
 */
public interface InterfaceHairproducts extends MongoRepository<Hairproducts, String> {
        
}
