package date;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"appetizer"})
public class ChrismasDto {

private String appetizer;
private String mainMenu;
private String dessert;
private String drink;
@Builder(builderClassName = "builder")
public ChrismasDto (String appetizer, String mainMenu, String dessert, String drink){
    this.appetizer = appetizer;
    this.mainMenu = mainMenu;
    this.dessert = dessert;
    this.drink = drink;
}
}
