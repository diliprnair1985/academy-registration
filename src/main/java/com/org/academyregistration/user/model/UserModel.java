package com.org.academyregistration.user.model;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private  String userId;
    private  String firstName;
    private  String lastName;
    private  String role;
}
