package africa.semicolon.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Address {

    private String id;

    private String houseNumber;

    private  String street;

    private  String localGovernment;

    private  String town;

    private String state;
}
