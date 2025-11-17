package Controller;


import Service.ColaboradorService;
import Service.EpisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class Controller implements CommandLineRunner {

    @Autowired
    private ColaboradorService colaboradorService;

    @Autowired
    private EpisService episService;

    @Override
    public void run(String... args) throws Exception {
    }

}
