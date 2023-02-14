package com.linecruz.projetoprogramacaoweb.repository;

import com.linecruz.projetoprogramacaoweb.model.entity.Livro;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
//import com.querydsl.core.types.Predicate;


import java.util.ArrayList;
import java.util.List;

@Repository
public class LivroFilterRepository extends QuerydslRepositorySupport {
    @PersistenceContext
    private EntityManager em;

    public LivroFilterRepository() {
        super(Livro.class);
    }

//    public List<Livro> filter(Livro livro) {
//        return null;
//    }

    @Transactional
    public List<Livro> filter(Livro filter){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Livro> cq =  cb.createQuery(Livro.class);
        Root<Livro> root = cq.from(Livro.class);
        List<Predicate> predicates = new ArrayList<>();

        if(filter.getNome()!=null) {
            predicates.add((Predicate) cb.like(cb.upper(root.get("nome")), "%"+filter.getNome().toUpperCase()+"%"));
        }

        if(filter.getIsbn()!=null) {
            predicates.add((Predicate) cb.like(cb.upper(root.get("isbn")), "%"+filter.getIsbn().toUpperCase()+"%" ));
        }

        cq.where(cb.and((Predicate[]) predicates.toArray(new Predicate[predicates.size()])));

        List<Livro> livros = em.createQuery(cq).getResultList();
        return livros;
    }

//    public List<Livro> filter(Livro filter) {
//        QLivro livro = QLivro.livro;
//
//        List<Predicate> predicates = new ArrayList<>();
//
//        if (filter.getNome() != null) {
//            predicates.add(livro.nome.likeIgnoreCase("%" + filter.getNome() + "%"));
//        }
//
//        if (filter.getIsbn() != null) {
//            predicates.add(livro.isbn.goe(filter.getIsbn()));
//        }
//
//        return new JPAQueryFactory(em).selectFrom(livro).where(predicates.toArray(new Predicate[0])).fetch();
//
//    }

}
