package homework.service;

import homework.model.User;

public class PersisterService implements SaverService {
    private final User user;

    public PersisterService(User user){
        this.user = user;
    }

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
