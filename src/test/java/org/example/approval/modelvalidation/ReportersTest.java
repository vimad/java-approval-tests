package org.example.approval.modelvalidation;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.jupiter.api.Test;

public class ReportersTest {

    @UseReporter({ClipboardReporter.class})
    @Test
    void useClipboardReporter() {
        Approvals.verify("Tests");
    }
}
