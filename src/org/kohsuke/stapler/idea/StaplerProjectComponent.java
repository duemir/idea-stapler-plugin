package org.kohsuke.stapler.idea;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Kohsuke Kawaguchi
 */
public class StaplerProjectComponent implements ProjectComponent {
    private ReferenceProvidersRegistry registry;
//    private NamespaceFilter stripesNamespaceFilter;

    public StaplerProjectComponent(Project project) {
        registry = ReferenceProvidersRegistry.getInstance(project);

    }

    public void projectOpened() {
    }

    public void projectClosed() {
    }

    @NonNls @NotNull
    public String getComponentName() {
        return getClass().getSimpleName();
    }

    public void initComponent() {
    /*
        With a custom XmlElementDescriptor, a custom reference provider is no longer necessary.

        // since the first two parameters are null, this reference provider applies everywhere
        // this was actually not what I was looking for --- this defines reference from the
        // content of an XML element, not from an XML element name.
        JellyTagLibReferenceProvider p = new JellyTagLibReferenceProvider();
        registry.registerReferenceProvider(StandardPatterns.instanceOf(XmlTag.class), p);
        registry.registerReferenceProvider(StandardPatterns.instanceOf(XmlAttribute.class), p);

        // this doesn't call us back at all
//        registry.registerReferenceProvider(XmlToken.class,new JellyTagLibReferenceProvider());
*/
    }

    public void disposeComponent() {
    }
}
