import Model.Gym;
import Model.Member;
import Model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GymService {
    @Autowired
    private GymRepository gymRepository;
    public void addGym(Gym gym) {
        gymRepository.addGym(gym);
    }

    public void addMember(Member member) {
        gymRepository.addMember(member);
    }

    public void addTrainer(Trainer trainer) {
        gymRepository.addTrainer(trainer);
    }
    public Gym findGymWithMostNumberOfMembers()
    {
        List<Gym> gymList=gymRepository.getAllGyms();
        int maxMembers=0;
        Gym largestMemberGym=null;
        for(Gym gym:gymList)
        {
            if(maxMembers<gym.getMemberList().size())
            {
                largestMemberGym=gym;
            }
            maxMembers=gym.getMemberList().size();
        }
        return largestMemberGym;
    }

    public Member memberMaxTrainers()
    {
        List<Member> memberList=gymRepository.getAllMembers();
        int maxTrainers=0;
        Member memberMaxTrainers=null;
        for(Member member:memberList)
        {
            if(maxTrainers<member.getTrainerList().size())
            {
                maxTrainers=member.getTrainerList().size();
                memberMaxTrainers=member;
            }
        }
        return memberMaxTrainers;
    }
    public int Trainers()
    {
        List<Trainer> trainerList=gymRepository.getAllTrainers();
        int trainer=0;
        for(Trainer t: trainerList)
        {
            if(t.getGymList().size()>1)
                trainer++;
        }
        return trainer;
    }
}
