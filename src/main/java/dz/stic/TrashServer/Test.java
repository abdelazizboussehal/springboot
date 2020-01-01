package dz.stic.TrashServer;

import dz.stic.TrashServer.classpersistence.Challenge;
import dz.stic.TrashServer.classpersistence.MainTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class Test {
    @Autowired
    MainTest mainTest;
    @GetMapping("/")
    public Challenge listeProduits() {
        mainTest=new MainTest();
        return mainTest.challenges();
    }
}
