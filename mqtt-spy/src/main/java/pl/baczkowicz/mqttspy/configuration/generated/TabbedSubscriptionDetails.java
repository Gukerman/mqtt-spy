//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.02 at 09:29:24 PM GMT 
//


package pl.baczkowicz.mqttspy.configuration.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;
import pl.baczkowicz.mqttspy.common.generated.SubscriptionDetails;


/**
 * <p>Java class for TabbedSubscriptionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabbedSubscriptionDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://baczkowicz.pl/mqtt-spy/common}SubscriptionDetails">
 *       &lt;attribute name="createTab" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabbedSubscriptionDetails")
public class TabbedSubscriptionDetails
    extends SubscriptionDetails
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlAttribute(name = "createTab")
    protected Boolean createTab;

    /**
     * Default no-arg constructor
     * 
     */
    public TabbedSubscriptionDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TabbedSubscriptionDetails(final Boolean createTab) {
        this.createTab = createTab;
    }

    /**
     * Gets the value of the createTab property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreateTab() {
        if (createTab == null) {
            return false;
        } else {
            return createTab;
        }
    }

    /**
     * Sets the value of the createTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateTab(Boolean value) {
        this.createTab = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            Boolean theCreateTab;
            theCreateTab = this.isCreateTab();
            toStringBuilder.append("createTab", theCreateTab);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof TabbedSubscriptionDetails)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final TabbedSubscriptionDetails that = ((TabbedSubscriptionDetails) object);
        equalsBuilder.append(this.isCreateTab(), that.isCreateTab());
    }

    public boolean equals(Object object) {
        if (!(object instanceof TabbedSubscriptionDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        super.hashCode(hashCodeBuilder);
        hashCodeBuilder.append(this.isCreateTab());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final TabbedSubscriptionDetails copy = ((target == null)?((TabbedSubscriptionDetails) createCopy()):((TabbedSubscriptionDetails) target));
        super.copyTo(copy, copyBuilder);
        {
            Boolean sourceCreateTab;
            sourceCreateTab = this.isCreateTab();
            Boolean copyCreateTab = ((Boolean) copyBuilder.copy(sourceCreateTab));
            copy.setCreateTab(copyCreateTab);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new TabbedSubscriptionDetails();
    }

}
