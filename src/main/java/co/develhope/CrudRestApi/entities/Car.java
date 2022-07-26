package co.develhope.CrudRestApi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Tania Ielpo
 */

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="model",nullable = false)
    private String model;
    @Column(name="serial_number",nullable = false)
    private String serialNumber;

    @Column(name="price")
    private Double currentPrice;
}
