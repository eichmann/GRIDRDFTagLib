package edu.uiowa.slis.GRIDRDF.Government;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentHasParent extends edu.uiowa.slis.GRIDRDF.TagLibSupport {
	static GovernmentHasParent currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentHasParent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentHasParentIterator theGovernmentHasParentIterator = (GovernmentHasParentIterator)findAncestorWithClass(this, GovernmentHasParentIterator.class);
			pageContext.getOut().print(theGovernmentHasParentIterator.getHasParent());
		} catch (Exception e) {
			log.error("Can't find enclosing Government for hasParent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Government for hasParent tag ");
		}
		return SKIP_BODY;
	}
}

