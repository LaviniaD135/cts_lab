package seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import org.junit.jupiter.api.Test;
@RunWith(JUnitPlatform.class)
@SelectPackages("seminar14.unittesting")
@IncludeTags("importante")

class AllTest {

	

}
