/*
 * generated by Xtext 2.14.0
 */
package com.avaloq.tools.ddk.sample.helloworld.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Represents a generated, default implementation of superclass {@link TerminalsProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them
 * with a more concrete subtype.
 */
public abstract class AbstractHelloWorldProposalProvider extends TerminalsProposalProvider {

  public void completeModel_Greetings(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeModel_KeywordsExample(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeGreeting_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeKeywordsExample_Option(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }

  public void complete_KeyOne(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    acceptor.accept(createCompletionProposal("one", context));
  }
  public void complete_KeyTwo(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    acceptor.accept(createCompletionProposal("two", context));
  }
  public void complete_KeyOther(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    acceptor.accept(createCompletionProposal("one", context));
    acceptor.accept(createCompletionProposal("two", context));
    acceptor.accept(createCompletionProposal("three", context));
  }

  public void complete_Model(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_Greeting(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_KeywordsExample(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_OptionOne(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_OptionTwo(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
}
