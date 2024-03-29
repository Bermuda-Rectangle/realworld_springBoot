package GDSC.realWorld.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import GDSC.realWorld.domain.ArticleDTO;
import GDSC.realWorld.domain.CommentDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@RequiredArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private LocalDateTime createdAt;
    
    @Column(nullable = false)
    private LocalDateTime updatedAt;
 
    @Column(nullable = false)
    private String body;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "authorId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;

    public Comment(CommentDTO commentDTO, User user) {
        this.id = UUID.randomUUID().toString();
        this.body = commentDTO.getBody();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.user = user;
    }

    public String getid() {
        return this.id;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
