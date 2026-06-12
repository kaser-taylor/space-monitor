Title:
    ADR 4 Security

Context:
    I try to maintain a security conscious technology attitude and would like to ensure I am following best practices. In the past I have used things like pre-commit and detect-secrets but I will also look into some other options

Decision:
    I will use pre-commit and detect-secrets. I will also make sure github server side scanning is enable. I will also add a basic Branch Protection rule that all pushes must go through a pull request reviewed by 1 person.

Status:
    In progress

Consequences:
