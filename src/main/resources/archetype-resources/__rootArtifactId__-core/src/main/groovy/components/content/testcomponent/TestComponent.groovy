package ${package}.components.content.testcomponent;

import com.citytechinc.cq.component.annotations.Component
import com.citytechinc.cq.component.annotations.DialogField
import com.citytechinc.cq.component.annotations.widgets.TextField
import com.citytechinc.aem.bedrock.core.components.AbstractComponent
import com.icfolson.aem.library.api.components.annotations.AutoInstantiate
import org.apache.sling.api.resource.Resource
import org.apache.sling.models.annotations.Model
import ${package}.annotations.AEMComponent

import javax.inject.Inject

@AEMComponent("Test Component")
public class TestComponent extends AbstractComponent {

	@DialogField(fieldLabel = "Test Title", fieldDescription = "Our title")
	@TextField
    @Inject
    private String title;
}
