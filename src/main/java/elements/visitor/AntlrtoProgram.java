package elements.visitor;

import elements.element.Formula;
import elements.element.Perturbation;
import elements.element.Program;
import gen.STLBaseVisitor;
import gen.STLParser;

import java.util.*;

public class AntlrtoProgram extends STLBaseVisitor<Program> {
    public List<String> semanticErrors;
    public Set<String> signalName;
    public static boolean isSetEqual(Set set1, Set set2) {
        /**
         * 判断两个集合是否相等
         */

        if (set2 == null) {
            return true;
        }
        if(set1 == null )
            return false;
        Iterator ite1 = set1.iterator();
        Iterator ite2 = set2.iterator();

        boolean isFullEqual = true;

        while (ite2.hasNext()) {
            if (!set1.contains(ite2.next())) {
                isFullEqual = false;
            }
        }

        return isFullEqual;
    }
    @Override
    public Program visitProgram_(STLParser.Program_Context ctx) {
        FormulaVisitor fv = new FormulaVisitor();
        Formula formula = fv.visit(ctx.getChild(0));
        List<Perturbation> pertList = new ArrayList<Perturbation>();
        Set<String> pertName = new HashSet<String>();
        for(int i = 1; i < ctx.getChildCount(); i++)
        {
             PerturbationVisitor pv = new PerturbationVisitor();
             Perturbation p = pv.visit(ctx.getChild(i));
             pertList.add(p);
            /**
             * 扰动重复定义有二义性
             */
            String name = p.sigName.substring(0,p.sigName.length()-6);
            if(pertName.contains(name))
            {
                semanticErrors.add("Error: duplicated perturbation");
            }
            else
            pertName.add(name);
        }
        /**
         * 判断扰动链表是否有不存在的信号
         */
        signalName = fv.getSignalName();
        if(!isSetEqual(signalName,pertName)) {
            semanticErrors.add("Error: perturbation is on non exist signal");
        }
        return new Program(formula,pertList);
    }
}
