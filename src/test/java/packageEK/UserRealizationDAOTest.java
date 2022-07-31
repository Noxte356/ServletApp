package packageEK;

import org.junit.jupiter.api.Test;
import packageEK.model.User;
import packageEK.model.UserRealizationDAO;

import static org.junit.jupiter.api.Assertions.*;

class UserRealizationDAOTest {
    UserRealizationDAO userRealizationDAO = new UserRealizationDAO();


    @Test
    void shouldReturnUserWithAllNotNullFields() {
        // given


        // when

        User actualUser = userRealizationDAO.findById(1310);

        // then

        assertTrue(actualUser.getId() > 0);
        assertNotNull(actualUser.getName());
        assertNotNull(actualUser.getMail());
        assertNotNull(actualUser.getPassword());
    }

}