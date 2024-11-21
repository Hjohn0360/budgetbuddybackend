package com.theelitelions.budgetbuddy.model.app;

import com.theelitelions.budgetbuddy.model.account.Account;
import com.theelitelions.budgetbuddy.model.user.User;
import com.theelitelions.budgetbuddy.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppDao {

    @Autowired
    private AppRepository repository;

    public App save(App app){
        return repository.save(app);
    }

    //Gives a list of all the apps
    public List<App> getAllApps(){
        List<App> apps = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(apps :: add);
        return apps;
    }

    // TODO -- Delete and Update methods(Keyron)
    public boolean deleteAppById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public App updateApp(int id, App updatedApp) {
        return repository.findById(id)
                .map(app -> {
                    app.setName(updatedApp.getName()); // Updates the fields
                    app.setBlocked(updatedApp.isBlocked());
                    app.setSpending_limit_exceeded(updatedApp.isSpending_limit_exceeded());
                    app.setSpending_limit(updatedApp.getSpending_limit());
                    app.setSpending_limit(updatedApp.getSpending_limit());
                    app.setLimit_reset(updatedApp.isLimit_reset());
                    app.setLimit_ignored(updatedApp.isLimit_ignored());
                    app.setIgnore_limit_amount(updatedApp.getIgnore_limit_amount());
                    return repository.save(app);
                })
                .orElse(null); // Return null if the user doesn't exist
    }
}
