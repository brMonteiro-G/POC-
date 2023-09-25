package com.project.poc.complainhere.Enterprise;

import com.project.poc.complainhere.Enterprise.Category.EnumCategory;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EnterpriseRequestDTO {


    private String name;
    private EnumCategory category;


}
