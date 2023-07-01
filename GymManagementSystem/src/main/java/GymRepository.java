import Model.Gym;
import Model.Member;
import Model.Trainer;
import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GymRepository {
    HashMap<String,Gym> gymHashMap=new HashMap<>();
    HashMap<String,Member> memberHashMap=new HashMap<>();
    HashMap<String,Trainer> trainerHashMap=new HashMap<>();
    public void addGym(Gym gym) {
        gymHashMap.put(gym.getGymId(),gym);
    }

    public void addMember(Member member) {
        memberHashMap.put(member.getMemberId(),member);
    }

    public void addTrainer(Trainer trainer) {
        trainerHashMap.put(trainer.getTrainerId(),trainer);
    }

    public List<Gym> getAllGyms() {

        return new ArrayList<>(gymHashMap.values());
    }

    public List<Member> getAllMembers() {
        return new ArrayList<>(memberHashMap.values());
    }

    public List<Trainer> getAllTrainers() {
        return new ArrayList<>(trainerHashMap.values());
    }
}
