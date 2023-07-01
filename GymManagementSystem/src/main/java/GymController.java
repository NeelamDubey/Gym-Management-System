import Model.Member;
import Model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Model.Gym;

import java.util.ArrayList;

@RestController
public class GymController {
    @Autowired
    GymService gymService;

    @PostMapping("/add-gym")
    public ResponseEntity<String> addGym(@RequestBody Gym gym)
    {
        gymService.addGym(gym);
        return new ResponseEntity<>("Gym added", HttpStatus.CREATED);
    }
    @PostMapping("/add-member")
    public ResponseEntity<String> addMember(@RequestBody Member member)
    {
        gymService.addMember(member);
        return new ResponseEntity<>("Member added", HttpStatus.CREATED);
    }
    @PostMapping("/add-Trainer")
    public ResponseEntity<String> addGym(@RequestBody Trainer trainer)
    {
        gymService.addTrainer(trainer);
        return new ResponseEntity<>("Trainer added", HttpStatus.CREATED);
    }

    @GetMapping("/gym-with-max-members")
    public ResponseEntity<Gym> findGymWithMostNumberOfMembers()
    {
        Gym gym=gymService.findGymWithMostNumberOfMembers();
        return new ResponseEntity<>(gym,HttpStatus.OK);
    }
    @GetMapping("/member-with-most-trainers")
    public ResponseEntity<Member> memberMaxTrainers()
    {
        Member member=gymService.memberMaxTrainers();
        return new ResponseEntity<>(member,HttpStatus.OK);
    }
    @GetMapping("/trainers-in-more-than-one-gym")
    public ResponseEntity<Integer> trainersMoreThanInOneGym()
    {
        Integer trainers=gymService.Trainers();
        return new ResponseEntity<>(trainers,HttpStatus.OK);
    }

}
