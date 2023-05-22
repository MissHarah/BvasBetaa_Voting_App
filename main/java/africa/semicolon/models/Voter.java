package africa.semicolon.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voter {

private  String id;

private Gender gender;

private  UserInformation userInformation;

public  String voterIdentificationNumber;

private String name;

private Address address;

private Integer age;



}
