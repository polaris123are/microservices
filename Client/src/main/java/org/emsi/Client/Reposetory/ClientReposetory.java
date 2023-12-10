package org.emsi.Client.Reposetory;

import org.emsi.Client.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientReposetory extends JpaRepository<Client,Long>
{

}
