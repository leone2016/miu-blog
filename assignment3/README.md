1. Create/draw the Analysis domain model Class diagram for your project. In the diagram, make sure to include as many of the classes, attributes, relationships and multiplicities, as possible at this point in the process.

- Classes & Attributes:
User: id, username, email, password, bio, image.
Profile: userId, followerCount, articleCount.
Article: id, title, body, slug, createdAt, updatedAt.
Comment: id, body, createdAt, articleId, authorId.
Tag: id, name.
Favorite: userId, articleId.
Follow: followerId, followedId.

- Relationships:
One User writes many Articles.
One User has one Profile.
One User can follow many Users (via Follow relation).
One User can write many Comments.
One User can favorite many Articles.
One Article can have many Tags.
One Article can have many Comments.
One Comment is written by one User.

![Class Diagram](ClassDiagram.png)

2. Choose 2 of your Major Use-cases (or User stories), using the description of the main Scenarios you created in Lab2, draw the sequence diagrams for each of the two.

    1.Login Sequence:
    ![LoginSequence](LoginSequence.png)

    2. Create Article:
    ![CreateArticle](CreateArticle.png)

3.
