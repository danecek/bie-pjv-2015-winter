/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.SQLException;

/**
 *
 * @author danecek
 */
class PersonException extends Exception {
    
    public PersonException(SQLException ex) {
        super(ex);
    }
    
}
