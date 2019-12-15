package App.Repository;

import App.Model.HeadersInvoices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeaderInvRepo extends JpaRepository<HeadersInvoices, Integer> {
}
