package nova.stringstore.service;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.
import org.keycloak.representations.idm.RealmRepresentation;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Service
public class KeycloakService {

    private Keycloak keycloak;

    @PostConstruct
    public void init() {
        this.keycloak = KeycloakBuilder.builder()
                .serverUrl("http://localhost:8080/auth")
                .realm("master")
                .username("admin")
                .password("admin")
                .clientId("admin-cli")
                .build();

        createRealm();
    }

    public void createRealm() {
        RealmRepresentation realm = new RealmRepresentation();
        realm.setId("your-realm");
        realm.setRealm("your-realm");
        realm.setEnabled(true);
        // Configure the realm as needed, e.g., roles

        keycloak.realms().create(realm);
        // Further configuration for roles and users can be added here
    }
}
