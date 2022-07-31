package packageEK;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import packageEK.model.UrlExtractor;

import static org.junit.jupiter.api.Assertions.*;

class UrlExtractorTest {
    UrlExtractor urlExtractor = new UrlExtractor();
    @Test
    @DisplayName("Должен отдавать айдишник, когда передается правильная стринга с айди на конце")
    void shouldReturnId(){
        // given


        // when
        int actualId = urlExtractor.parsing("/ServletAppi/personalAccount/1310");


        // then
        assertEquals(1310,actualId);
    }



}