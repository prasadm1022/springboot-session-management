package org.upwork.prototype.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Customer Entity
 *
 * @author prasadm
 * @since 29 May 2022
 */

@Getter
@Setter
@Entity
@Table( name = "OP_CUSTOMER" )
public class OpCustomer implements Serializable
{
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "id_seq_customer" )
    @SequenceGenerator( name = "id_seq_customer", sequenceName = "CUSTOMER_ID_SEQ", allocationSize = 1 )
    @Column( name = "ID" )
    private Long id;

    @Column( name = "FIRST_NAME" )
    @Size( max = 128 )
    private String firstName;

    @Column( name = "LAST_NAME" )
    @Size( max = 128 )
    private String lastName;

    @Column( name = "ADDRESS" )
    @Size( max = 128 )
    private String address;

    @Column( name = "ZIP_CODE" )
    @Size( max = 8 )
    private String zipCode;

    @Column( name = "CITY" )
    @Size( max = 64 )
    private String city;

    @Column( name = "COUNTRY" )
    @Size( max = 64 )
    private String country;

    @Override
    public boolean equals( Object o )
    {
        if( this == o ) return true;
        if( !( o instanceof OpCustomer ) ) return false;
        OpCustomer that = ( OpCustomer ) o;
        return Objects.equals( id, that.getId() )
                       && Objects.equals( this.firstName, that.getFirstName() )
                       && Objects.equals( this.lastName, that.getLastName() )
                       && Objects.equals( this.address, that.getAddress() )
                       && Objects.equals( this.zipCode, that.getZipCode() )
                       && Objects.equals( this.city, that.getCity() )
                       && Objects.equals( this.country, that.getCountry() );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( this.id, this.firstName, this.lastName, this.address, this.zipCode, this.city, this.country );
    }
}
