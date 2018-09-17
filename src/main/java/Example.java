

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import datomic.*;

import java.util.List;
import java.util.Scanner;
import java.util.Collection;

import static datomic.Util.read;


@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
        String home() {
  // Your connection information for local mbrainz 1968-1973 subset goes here.
            String uri = "datomic:dev://localhost:4334/mbrainz-1968-1973";
  
  //Connect to transactor, get latest database value from storage
            Connection conn = Peer.connect(uri);
            Database db = conn.db();
            return "Hello World Datomic Connected!!";
        }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
