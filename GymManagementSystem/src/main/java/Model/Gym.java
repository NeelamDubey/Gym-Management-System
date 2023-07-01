package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Gym {
    private String GymId;
    private String location;
    List<Member> memberList;
    List<Trainer> trainerList;

}
