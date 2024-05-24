WITH RECURSIVE GenerationCTE AS (
    -- 기초 세대 (부모가 없는 개체들)
    SELECT
        ID,
        PARENT_ID,
        1 AS GENERATION
    FROM
        ECOLI_DATA
    WHERE
        PARENT_ID IS NULL
    UNION ALL
    -- 각 개체의 자식들을 찾고 세대를 증가시킴
    SELECT
        E.ID,
        E.PARENT_ID,
        G.GENERATION + 1
    FROM
        ECOLI_DATA E
    JOIN
        GenerationCTE G ON E.PARENT_ID = G.ID
),
-- 자식이 없는 대장균 식별
LeafNodes AS (
    SELECT
        G.ID,
        G.GENERATION
    FROM
        GenerationCTE G
    LEFT JOIN
        ECOLI_DATA E ON G.ID = E.PARENT_ID
    WHERE
        E.ID IS NULL
)
SELECT
COUNT(ID) AS COUNT,
    GENERATION
    
FROM
    LeafNodes
GROUP BY
    GENERATION
ORDER BY
    GENERATION;
